package command;

import bussines.Product;

import java.io.IOException;
import java.util.ArrayList;

public interface ICommand {
    void execute() throws IOException;
}
