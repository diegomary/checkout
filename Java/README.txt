Here we are presenting 2 different solutions for the Java implementation.

They differ only slightly in the way the offers are calculated.

We use SOLID single responsability principle and dependency injection.

We think that the MVP of the given products be product B.

We flag the offer so that a product administrator can decide if the offer 
for a certain product can be on air or not.

The entire development has been accomplished using TDD since test first has been written 
for the classes ProductScanner and ProductScanner1. the following tests initially failed:

 		//Should return a Grand Total of 5.0 USing Solution 1
        ProductScanner scanner = new ProductScanner(TestPurchase1.Purchase());
        System.out.println("Solution 1: Test 1 Grand Total : " + scanner.GrandTotal()); 
        
        //Should return a Grand Total of 2.5
        scanner = new ProductScanner(TestPurchase2.Purchase());
        System.out.println("Solution 1: Test 2 Grand Total : "+ scanner.GrandTotal());   

        .........

        .........

The development has used the following environment.

Product Version: NetBeans IDE 8.2 (Build 201609300101)
Updates: NetBeans IDE is updated to version NetBeans 8.2 Patch 2
Java: 1.8.0_131; Java HotSpot(TM) 64-Bit Server VM 25.131-b11
Runtime: Java(TM) SE Runtime Environment 1.8.0_131-b11
System: Windows 10 version 10.0 running on amd64; Cp1252; fr_FR (nb)

No special framework have been adopted.         