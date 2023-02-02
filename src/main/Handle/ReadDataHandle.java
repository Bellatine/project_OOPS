package main.Handle;

import main.Bean.People.King;
import main.Bean.Place.Capital;
import main.Cache.Constant;
import main.Cache.LoadCache;
import org.apache.jena.base.Sys;

import java.io.*;
import java.util.Properties;

public class ReadDataHandle {
    public void loadConf() throws Exception {
        File file = new File("/Users/hh/Documents/CODE/TEST/oops_project/conf/properties.conf");
        Properties properties = new Properties();
        FileInputStream confFile = new FileInputStream(file.getAbsoluteFile());
        properties.load(new InputStreamReader(confFile,"UTF-8"));
        Constant.lyKing = properties.getProperty("Ly_King");
        /*Constant.lyKing = "select MIN(?dynasty) MIN(?name) MIN(?start) MIN(?end) MIN(?capital) MIN(?nationname) \n" +
                "where {\n" +
                "?dynasty dbo:wikiPageID   \"1583395\"^^xsd:integer .\n" +
                "?dynasty dbp:surname ?name .\n" +
                "?dynasty dbp:yearStart ?start .\n" +
                "?dynasty dbp:yearEnd ?end .\n" +
                "?dynasty dbp:capital ?capital .\n" +
                "?dynasty dbp:conventionalLongName ?nationname .\n" +
                "}group by ?dynasty";*/
        Constant.lyDynasty = properties.getProperty("Ly_dynasty");
        Constant.fileSaveDir = properties.getProperty("fileSaveDir");
        Constant.location = properties.getProperty("location");
        Constant.split = properties.getProperty("split");
    }
    public void LoadLyKingObject(String data){
        String[] array = data.split(Constant.split);
        Capital capital = new Capital(array[3]);
        King king = new King(array[0],array[1],array[2],capital,array[4],array[5],array[6]);
        LoadCache.lyKing.add(king);
    }




    public void ReadLyKings() throws IOException {
        File fileDir = new File("/Users/hh/Documents/CODE/TEST/oops_project/Data/"+Constant.lyKingFileName);
        FileInputStream fileInputStream = new FileInputStream(fileDir);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String str;

        while ((str = bufferedReader.readLine()) != null) {
            LoadLyKingObject(str);
        }

        bufferedReader.close();
    }
    public static void main(String[] args) throws Exception {
        ReadDataHandle readDataHandle = new ReadDataHandle();
        readDataHandle.loadConf();
        readDataHandle.ReadLyKings();
        King king = LoadCache.lyKing.get(0);
        System.out.println(king.getKingName());
        System.out.println(king.getName());
    }
}
