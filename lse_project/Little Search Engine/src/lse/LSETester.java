package lse;

import java.io.*;
import java.util.*;

public class LSETester {

	public static void main(String[] args) throws FileNotFoundException {
		        LittleSearchEngine google = new LittleSearchEngine();
		        try {
		            google.makeIndex("docs.txt", "noisewords.txt");
		        } catch (FileNotFoundException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		        
		        System.out.println("-------");
		        for(String k : google.keywordsIndex.keySet()) {
		            System.out.print("'" + k + "'" + ": ");
		            for(Occurrence o : google.keywordsIndex.get(k)) {
		                System.out.print(o + " -> ");
		            }
		            System.out.println();
		            System.out.println();
		        }
//		        ArrayList<Occurrence> arr1 = new ArrayList<Occurrence>();
//				arr1.add(new Occurrence("doc1.txt",8 ));
//				arr1.add(new Occurrence("doc2.txt",7 ));
//				arr1.add(new Occurrence("doc3.txt",6 ));
//				arr1.add(new Occurrence("doc4.txt",5 ));
//				arr1.add(new Occurrence("doc5.txt",3 ));
//				arr1.add(new Occurrence("doc6.txt",2 ));
//				System.out.println(arr1);
//				System.out.println(google.insertLastOccurrence(arr1));
//				System.out.println(arr1);
		        
		        Scanner words = new Scanner(System.in);
		        String k1 = "", k2 = "";
				while (true) {
					System.out.println("Enter two keywords now. Type \"q\" for either keyword to quit");
					System.out.print("Keyword 1:");
					k1 = words.nextLine();
					if(k1.equals("q")) {
						break;
					}
					System.out.print("Keyword 2:");
					k2 = words.nextLine();
					if(k2.equals("q")) {
						break;
					}
					//ArrayList<String> top5 = google.top5search("deep", "world");	
				ArrayList<String> top5 = google.top5search(k1, k2);
		        for(String doc : top5) {
		            System.out.println(doc);
		        }		        
				}
		   }
	}
//		LittleSearchEngine lse = new LittleSearchEngine();
//
//		String docFile = "docs.txt"; //file containing references to all txt documents
//		
////		AliceCh1.txt
////		WowCh1.txt
////		books/mice.txt
////		books/oedip10.txt
////		books/scrlt11.txt
////		books/sleep10.txt
////		books/stoker-dracula-168.txt
////		books/swift-gullivers-728.txt
////		books/wizrd_oz.txt
////		books/zenda10.txt
//		lse.makeIndex(docFile, "noisewords.txt"); //Index all of our documents
//		Scanner words = new Scanner(System.in);
//		/*getKeyword*/
////		System.out.println(lse.getKeyword("Word"));
////		System.out.println(lse.getKeyword("night,"));
////		System.out.println(lse.getKeyword("question??"));
////		System.out.println(lse.getKeyword("Could"));
////		System.out.println(lse.getKeyword("test-case"));
//		/*loadKeyWords*/
////		System.out.println("AliceCh1: " + lse.loadKeywordsFromDocument("AliceCh1.txt"));
////		System.out.println("WowCh1: " + lse.loadKeywordsFromDocument("WowCh1.txt"));
////		System.out.println("pohlx: " + lse.loadKeywordsFromDocument("pohlx.txt"));
////		System.out.println("Tyger: " + lse.loadKeywordsFromDocument("Tyger.txt"));
////		System.out.println("Jude: " + lse.loadKeywordsFromDocument("jude.txt"));
//		
////		System.out.println("");
//		

			


//		/* Extreme left insertion */
////		ArrayList<Occurrence> arr1 = new ArrayList<Occurrence>();
////		arr1.add(new Occurrence("doc1.txt",20 ));
////		arr1.add(new Occurrence("doc2.txt",15 ));
////		arr1.add(new Occurrence("doc3.txt",14 ));
////		arr1.add(new Occurrence("doc4.txt",12 ));
////		arr1.add(new Occurrence("doc5.txt",12 ));
////		arr1.add(new Occurrence("doc6.txt",10 ));
////		arr1.add(new Occurrence("doc7.txt",8 ));
////		arr1.add(new Occurrence("doc8.txt",21 ));
////		System.out.println(arr1);
////		System.out.println(lse.insertLastOccurrence(arr1));
////		System.out.println(arr1);
//		
//		/*Extreme right insertion */
////		ArrayList<Occurrence> arr1 = new ArrayList<Occurrence>();
////		arr1.add(new Occurrence("doc1.txt",20 ));
////		arr1.add(new Occurrence("doc2.txt",15 ));
////		arr1.add(new Occurrence("doc3.txt",14 ));
////		arr1.add(new Occurrence("doc4.txt",12 ));
////		arr1.add(new Occurrence("doc5.txt",12 ));
////		arr1.add(new Occurrence("doc6.txt",10 ));
////		arr1.add(new Occurrence("doc7.txt",8 ));
////		arr1.add(new Occurrence("doc8.txt",1 ));
////		System.out.println(arr1);
////		System.out.println(lse.insertLastOccurrence(arr1));
////		System.out.println(arr1);
//		
//		/* In Between */
////		ArrayList<Occurrence> arr1 = new ArrayList<Occurrence>();
////		arr1.add(new Occurrence("doc1.txt",20 ));
////		arr1.add(new Occurrence("doc2.txt",15 ));
////		arr1.add(new Occurrence("doc3.txt",14 ));
////		arr1.add(new Occurrence("doc4.txt",12 ));
////		arr1.add(new Occurrence("doc5.txt",12 ));
////		arr1.add(new Occurrence("doc6.txt",10 ));
////		arr1.add(new Occurrence("doc7.txt",8 ));
////		arr1.add(new Occurrence("doc8.txt",13 ));
////		System.out.println(arr1);
////		System.out.println(lse.insertLastOccurrence(arr1));
////		System.out.println(arr1);
//		
//		/* Insertion when there is a Match */
////		ArrayList<Occurrence> arr1 = new ArrayList<Occurrence>();
////		arr1.add(new Occurrence("doc1.txt",20 ));
////		arr1.add(new Occurrence("doc2.txt",15 ));
////		arr1.add(new Occurrence("doc3.txt",14 ));
////		arr1.add(new Occurrence("doc4.txt",12 ));
////		arr1.add(new Occurrence("doc5.txt",12 ));
////		arr1.add(new Occurrence("doc6.txt",10 ));
////		arr1.add(new Occurrence("doc7.txt",8 ));
////		arr1.add(new Occurrence("doc8.txt",10));
////		System.out.println(arr1);
////		System.out.println(lse.insertLastOccurrence(arr1));
////		System.out.println(arr1);
////		for (String key : lse.keywordsIndex.keySet()){// may produce null keys 
////			ArrayList<Occurrence> list = lse.keywordsIndex.get(key);//get key of occurrence object
////			if(list.size() >= 2) {
////				System.out.println(key + list);
////			}
////		}
//		//System.out.println(lse.keywordsIndex);
//		String k1 = "", k2 = "";
//		while (true) {
//			System.out.println("Enter two keywords now. Type \":q\" for either keyword to quit");
//			System.out.print("Keyword 1:");
//			k1 = words.nextLine();
//			if(k1.equals(":q")) {
//				break;
//			}
//			System.out.print("Keyword 2:");
//			k2 = words.nextLine();
//			if(k2.equals(":q")) {
//				break;
//			}
//			
//			
//			long pre = System.nanoTime();
//			ArrayList<String> results = lse.top5search(k1, k2);
//			long post = System.nanoTime();
//			float seconds = (post - pre) / 1000000000f;
//			if(results != null){
//				System.out.println(results.size() + " results in " + seconds + " seconds.");
//				for (String s : results) {
//					System.out.print(s + ", ");
//				}
//			} else {
//				System.out.println("0 results in " + seconds + " seconds.");
//			}
//			System.out.println();
//
//		}
//		
//		System.out.println("Thank you for using the Little Search Engine!");
//
//	}