package br.dev.aline.lopal_tarefas.factory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileFactory {
private String arquivoFuncionario = "/Users/25132561/Documents/tarefasDS1TA/funcionarios.csv";
private String arquivoTarefa = "/Users/25132561/Documents/tarefasDS1TA/tarefas.csv";

//Funcionario
private FileWriter fwf;
private BufferedWriter bwf;

private FileReader frf;
private BufferedReader brf;

//Tarefa
private FileWriter fwt;
private BufferedWriter bwt;

private FileReader frt;
private BufferedReader brt;


public FileFactory() throws IOException {
//Necessário para escrever no arquivo
fwf = new FileWriter(arquivoFuncionario, true);
bwf = new BufferedWriter(fwf);

//Necessário para ler o arquivo
frf = new FileReader(arquivoFuncionario);
brf = new BufferedReader(frf);

//Tarefas
fwt = new FileWriter(arquivoTarefa, true);
bwt = new BufferedWriter(fwt);

frt = new FileReader(arquivoTarefa);
brt = new BufferedReader(frt);
}

//Funcionario
public BufferedWriter getBufferedWriterFuncionario() {
return bwf;
}

public BufferedReader getBufferedReaderFuncionario() {
return brf;
}

//Tarefa
public BufferedWriter getBufferedWriterTarefa() {
return bwt;
}

public BufferedReader getBufferedReaderTarefa() {
return brt;
}

}