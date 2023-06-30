package com.selflearning.selflearning.restapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 4, 5, 3, 6, 8, 5, 3, 3, 4, 6, 7, 9);

		List<Integer> naturalSortingorder = integerList.stream().sorted().toList();

		System.out.println("naturalSortingorder  " + naturalSortingorder);
		List<Integer> ListIntegernaturalOrder = integerList.stream().sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
		System.out.println("ListIntegernaturalOrder  " + ListIntegernaturalOrder);

		List<Integer> ListIntegerAsc = integerList.parallelStream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("ListIntegerAsc  " + ListIntegerAsc);

		Employee e1 = new Employee(1, "Anurag", 3);
		Employee e2 = new Employee(2, "Mani", 4);
		Employee e3 = new Employee(3, "Sonkar", 3);
		Employee e4 = new Employee(4, "Jugad", 5);
		Employee e5 = new Employee(5, "Tahalka", 3);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);

		@SuppressWarnings("unchecked")
		List<Employee> empListSortingComparaor = (List<Employee>) empList.parallelStream()
				.sorted(new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						// TODO Auto-generated method stub
						return o1.getEmployeeName().compareTo(o2.getEmployeeName());
					}
				}).collect(Collectors.toList());
		System.out.println("empListSortingComparaor   " + empListSortingComparaor);
		
		List<Employee> ListEmpSortByManagerId = (List<Employee>) empList.parallelStream().sorted(new Comparator<Employee>(){

		//	@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o2.getManagerId()-o1.getManagerId();
			}}).collect(Collectors.toList());
		
		System.out.println("ListEmpSortByManagerId    "+ListEmpSortByManagerId);
		//List<Employee> ListEmpSortComparatorMethod = empList.stream().sorted((o1,o2)->{o2.compare(o1)}).collect(collectors.toList()));
		List<Employee> sortedList = empList.stream()
		        .sorted((o1, o2) -> {
		            if(o1.getManagerId() == o2.getManagerId())
		                return o1.getEmployeeName().compareTo(o2.getEmployeeName());
		            else if(o1.getManagerId() > o2.getManagerId())
		                return 1;
		            else return -1;
		        })
		        .collect(Collectors.toList());
		
		System.out.println("  sortedList  "+sortedList);
	}

}
