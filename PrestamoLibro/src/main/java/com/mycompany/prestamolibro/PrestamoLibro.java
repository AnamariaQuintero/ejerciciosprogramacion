package com.mycompany.prestamolibro;
import book.Book;
import java.util.Scanner;

public class PrestamoLibro {

    static boolean isBookAvailable(Book[] array, String title){
        boolean bookStatus = false;
        for (Book book : array){
            if (book.getTitle().toLowerCase().equals(title)){
                bookStatus = book.isAvailable();
                break;
            }
        }
        return bookStatus;
    }
    
    public static void main(String[] args) {
        
        Book book1 = new Book("HarryPotter", 5, 25, "Fantasia");
        Book book2 = new Book("Elnombredelviento", 1, 18, "Fantasia");
        Book books [] = {book1, book2};
        
        Scanner scanner = new Scanner (System.in);
        int option =1;
        
        do{
            System.out.println("1. Agregar un nuevo libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Prestar un libro");
            System.out.println("4. Devolver el libro");
            System.out.println("5. Salir");
            System.out.println("Elija la opcion que desea realizar");

            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Ingrese el titulo del li");
                    break;
                case 2:
                    System.out.println("Ingrese el tiulo que desea buscar");
                    String titleBook = scanner.next().toLowerCase();
                    System.out.println(isBookAvailable(books, titleBook));
                    break;
                case 3:
                     System.out.println("hola");
                     break;
                case 4:
                     System.out.println("hola");
                     break;
                case 5:
                     System.out.println("hola");
                     break;
                default : 
                    System.out.println("Ingrese la opcion correcta");
                    option = 1;
            }
        }while(option >= 1 && option < 5);            
        
        
        
        
        
        //Presto el libro
        book1.lendBook();
        
        System.out.println("The book Harry Potter is available");
        System.out.println(book1.isAvailable());
        System.out.println("The book El nombre del viento is available");
        System.out.println(book2.isAvailable());
        
    }
}
