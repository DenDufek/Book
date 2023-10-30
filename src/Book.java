package bookpackage; // Пакет для збереження класів

// Клас Title
class Title {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public void show() {
        System.out.println("Title: " + title);
    }
}

// Клас Author
class Author {
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void show() {
        System.out.println("Author: " + author);
    }
}

// Клас Content
class Content {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public void show() {
        System.out.println("Content: " + content);
    }
}

// Клас Book (Main)
public class Book {
    public static void main(String[] args) {
        // Створюємо екземпляри класів Title, Author та Content
        Title bookTitle = new Title();
        Author bookAuthor = new Author();
        Content bookContent = new Content();

        // Додаємо назву книги, ім'я автора та зміст
        bookTitle.setTitle("Sample Book");
        bookAuthor.setAuthor("John Doe");
        bookContent.setContent("This is the content of the book.");

        // Виводимо інформацію на екран
        bookTitle.show();
        bookAuthor.show();
        bookContent.show();
    }
}