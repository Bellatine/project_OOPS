package main.CrawData;

import org.apache.jena.*;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.rdf.model.*;

import java.util.Arrays;
import java.util.List;

public class CrawRDF{
    String[][] Craw(ResultSet result) throws Exception{
        String[][] saveData = new String[50][50];
        List<String> columnNames = result.getResultVars();
        int dem=0;
        while(result.hasNext()){
            QuerySolution querySolution = result.nextSolution();
            for(int i=0;i<columnNames.size();i++){
                String columnName = columnNames.get(i);
                RDFNode node = querySolution.get(columnName);
                saveData[dem][i] = node.toString();
            }
            dem++;
        }
        return saveData;
    } 

}
