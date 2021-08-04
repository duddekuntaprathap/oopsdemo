package collectionsdemo;

import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
	Set<String> programmingLanguages = new HashSet<>();
	
	programmingLanguages.add("C");
    programmingLanguages.add("C++");
    programmingLanguages.add("Java");
    programmingLanguages.add("Python");
    programmingLanguages.add("PHP");
    programmingLanguages.add("Ruby");
    
    System.out.println("=== Iterate over a HashSet using iterator() ===");
    Iterator<String> programmingLanguageIterator = programmingLanguages.iterator();
    while (programmingLanguageIterator.hasNext()) {
        String programmingLanguage = programmingLanguageIterator.next();
        System.out.println(programmingLanguage);
       
    }
    System.out.println("=== Iterate over a HashSet using simple for-each loop ===");
    for(String programmingLanguage: programmingLanguages) {
        System.out.println(programmingLanguage);
    }
    
    HashSet<String> pl=new HashSet<>(programmingLanguages);
    System.out.println(pl);
    HashSet<String> clonePL=new HashSet<>();//empty hashset to clone
    clonePL=(HashSet)pl.clone();
    
    System.out.println(clonePL);
    
	}
}
