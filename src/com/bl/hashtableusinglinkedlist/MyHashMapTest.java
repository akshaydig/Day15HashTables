package com.bl.hashtableusinglinkedlist;

public class MyHashMapTest {
	public static void main(String[] args) {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value = value + 1;
			}
			myHashMap.add(word, value);

		}
		System.out.println(myHashMap);
		int frequency = myHashMap.get("are");
		System.out.println("Frequency of word(are) is " + frequency);

		myHashMap.delete("avoidable");
		System.out.println(myHashMap);
	}
}