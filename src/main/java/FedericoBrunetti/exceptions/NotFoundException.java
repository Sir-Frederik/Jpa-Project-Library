package FedericoBrunetti.exceptions;

public class NotFoundException extends RuntimeException {
  public NotFoundException(String id) {
    super("Il record con isbn " + id + " non è stato trovato!");
  }
}

