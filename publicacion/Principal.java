package publicacion;
import java.util.*;
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ctrlpub = 0;
        int opc;
        Object publicaciones [] = new Object[10]; //reservamos espacio
        
        do{
           System.out.println("<<<<<PUBLICACIONES>>>>>");
           System.out.println("1. Alta Libro ");
           System.out.println("2. Alta Periodico");
           System.out.println("3. Alta Revista");
           System.out.println("4. Mostrar Publicaciones");
           System.out.println("5. Salir");
           opc=leer.nextInt();
           switch(opc){
             case 1: 
                String ISBN;
                String titulo;
                String autor;
                String edicion;
                float precio;
                int numPag;
                Libro libro = new Libro();
                System.out.println("<<<<<Libro>>>>>");
                System.out.println("ISBN: ");
                ISBN=leer.next();
                libro.setISBN(ISBN);
                leer.nextLine();
                System.out.println("Titulo: ");
                titulo=leer.next();
                libro.setTitulo(titulo);
                leer.nextLine();
                System.out.println("Autor: ");
                autor=leer.next();
                libro.setAutor(autor);
                leer.nextLine();
                System.out.println("Edicon: ");
                edicion=leer.next();
                libro.setEdicion(edicion);
                leer.nextLine();
                System.out.println("Precio: ");
                precio=leer.nextFloat();
                libro.setPrecio(precio);
                System.out.println("Num Pag: ");
                numPag=leer.nextInt();
                libro.setNumpag(numPag);
                publicaciones [ctrlpub] = libro;//guarda el objeto en el arreglo
                ctrlpub++;
             break;
             
             case 2: 
                String secciones;
                String editor;
                String titulo1;
                float precio1;
                int numPag1;
                Periodico periodico = new Periodico();
                System.out.println("<<<<<Periodico>>>>>");
                System.out.println("Secciones: ");
                secciones=leer.next();
                periodico.setSecciones(secciones);
                leer.nextLine();
                System.out.println("Editor: ");
                editor=leer.next();
                periodico.setEditor(editor);
                leer.nextLine();
                System.out.println("Titulo: ");
                titulo1=leer.next();
                periodico.setTitulo(titulo1);
                leer.nextLine();
                System.out.println("Precio: ");
                precio1=leer.nextFloat();
                periodico.setPrecio(precio1);
                System.out.println("Num Pag: ");
                numPag1=leer.nextInt();
                periodico.setNumpag(numPag1);
                publicaciones [ctrlpub] = periodico;//guarda el objeto en el arreglo
                ctrlpub++;
             break;
             
             case 3:
                String ISSN;
                String titulo2;
                int numer;
                int anio;
                float precio2;
                int numPag2;
                Revista revista = new Revista();
                System.out.println("<<<<<Revista>>>>>");
                System.out.println("ISSN: ");
                ISSN=leer.next();
                revista.setISSN(ISSN);
                leer.nextLine();
                System.out.println("Titulo: ");
                titulo2=leer.next();
                revista.setTitulo(titulo2);
                leer.nextLine();
                System.out.println("Precio: ");
                precio2=leer.nextFloat();
                revista.setPrecio(precio2);
                System.out.println("Numero: ");
                numer=leer.nextInt();
                revista.setNumero(numer);
                System.out.println("Anio: ");
                anio=leer.nextInt();
                revista.setAnio(anio);
                System.out.println("Num Pag: ");
                numPag2=leer.nextInt();
                revista.setNumpag(numPag2);
                publicaciones [ctrlpub] = revista;//guarda el objeto en el arreglo
                ctrlpub++;

             
             break;

             
             case 4:
             System.out.println("<<<<<<<PUBLICACIONES>>>>>>>>");
                for(int i = 0; i < ctrlpub; i ++ ){
                  System.out.println("  " + publicaciones [i].getClass());
                  if(publicaciones[i] instanceof Revista){
                     Revista rev1 = new Revista();
                     rev1 = (Revista)publicaciones[i];
                     System.out.println("----REVISTA----");
                     System.out.println("ISSN " + rev1.getISSN());
                     System.out.println("Titulo " + rev1.getTitulo());
                     System.out.println("Precio " + rev1.getPrecio());
                     System.out.println("Numero " + rev1.getNumero());
                     System.out.println("Anio " + rev1.getAnio());
                     System.out.println("N. Pags " + rev1.getNumpag());
                
                  }
                  else if (publicaciones [i] instanceof Libro ){
                     Libro lib = new Libro();
                     lib = (Libro)publicaciones[i];
                     System.out.println("---LIBRO---");
                     System.out.println("ISBN " + lib.getISBN());
                     System.out.println("Titulo " + lib.getTitulo());
                     System.out.println("Autor " + lib.getAutor());
                     System.out.println("Edicion " + lib.getEdicion());
                     System.out.println("Precio " + lib.getPrecio());
                     System.out.println("N. Pags " + lib.getNumpag());
                 }
                 else if (publicaciones [i] instanceof Periodico ){
                     Periodico per = new Periodico();
                     per = (Periodico)publicaciones[i];
                     System.out.println("---Periodico---");
                     System.out.println("Secciones " + per.getSecciones());
                     System.out.println("Editor " + per.getEditor());
                     System.out.println("Titulo " + per.getTitulo());
                     System.out.println("Precio " + per.getPrecio());
                     System.out.println("N. Pags " + per.getNumpag());
                 }
               }
             break;
            
           }
        
        }while(opc!=5);
        
     }
   }