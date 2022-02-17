package classSamples.polymorphism.Firm;

import classSamples.polymorphism.SearchingAndSorting.Contact;

public class PhoneList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact[] friends = new Contact [8];
		
		friends[0] = new Contact("John", "Smitt", "610-555-7384");
		friends[1] = new Contact("Sarah", "Barnes", "215-555-3827");
		friends[2] = new Contact("Mark", "Rileys", "733-555-2969");
		friends[3] = new Contact("Laura", "Ghetz", "663-555-3984");
		friends[4] = new Contact("Larry", "Smiths", "464-555-3489");
		friends[5] = new Contact("Frank", "Phelps", "322-555-2284");
		friends[6] = new Contact("Mario", "Guzmana", "804-555-9066");
		friends[7] = new Contact("Marsha", "Grants", "243-555-2837");
		
		Sorting<Contact> sorts = new Sorting<Contact>();
		sorts.selectionSort(friends);
		
		for(Contact friend: friends) {
			System.out.println(friend);
		}
	}

}
