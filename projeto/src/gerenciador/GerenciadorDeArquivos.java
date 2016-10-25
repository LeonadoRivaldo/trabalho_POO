/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador;

import gerenciador.pedido.Pedido;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leona_000
 */
public class GerenciadorDeArquivos {

    public static void gravaArquivo(String file, String conteudo) throws FileNotFoundException, IOException {
        File files = new File(file);
        if (!files.exists()) {
            files.mkdirs();
        }
        FileOutputStream outFile = new FileOutputStream(file);
        BufferedWriter buff = new BufferedWriter(new FileWriter(file));
        buff.write(conteudo);
        buff.close();
        outFile.close();
    }

    private void escreveArquivoBinario(String dir, List<Pedido> lista) throws FileNotFoundException, IOException {
        String fileNameSe = "\\todosOsPedidos";
        FileOutputStream outFileSe = new FileOutputStream(dir + fileNameSe);
        ObjectOutputStream out = new ObjectOutputStream(outFileSe);
        out.writeObject(lista);
        outFileSe.close();
        out.close();
    }

}
