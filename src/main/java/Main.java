import java.io.*;
import java.lang.*;
import org.camunda.bpm.model.bpmn.*;

public class Main {
    public static void main(String[] args) {
        // read a model from a file
        File file = new File("/home/ivan/Documentos/CAMUNDA/invoice.bpmn");
        BpmnModelInstance modelInstance = Bpmn.readModelFromFile(file);
    }
}