/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.spigotmc;
import java.io.BufferedReader;
import java.io.*;
import java.net.URL;
import java.net.*;
import com.google.gson.*;
import org.bukkit.plugin.java.*;
import org.bukkit.command.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.Listener;


public class moderatorManagement extends JavaPlugin implements Listener {

    String hostname = ""; //change this
    String helpVerbiage = ""; //change this
    String token = ""; //change this


    @Override
    public void onEnable(){
        Bukkit.getPluginManager().registerEvents(this, this);
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
       if (sender instanceof Player) {
           Player player = (Player) sender;
           if (label.equalsIgnoreCase("mod")) {
               try {
                sendPut("http://"+hostname+"/change/role/mod/player/" + args[0].toLowerCase());
                player.setOp(true);
               } catch (Exception e) {
                   // server is down
               }
           } else if (label.equalsIgnoreCase("staff")) {
               try {
                sendPut("http://"+hostname+"/change/role/staff/player/" + args[0].toLowerCase());
                player.setOp(true);
               } catch (Exception e) {
                   // server is down
               }
           } else if (label.equalsIgnoreCase("de-mod")) {
               try {
                sendPut("http://"+hostname+"/change/role/none/player/" + args[0].toLowerCase());
                player.setOp(false);
               } catch (Exception e) {
                   // server is down
               }
           }
       }
       return true;
   }

   private JsonObject sendPut(String _url) throws Exception {

        String url = _url;

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestProperty("Authorization", token);

        con.setRequestMethod("PUT");

         InputStream response = con.getInputStream();

         try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(response, "UTF-8"));
            String jsonText = readAll(rd);
            JsonObject json = new JsonParser().parse(jsonText).getAsJsonObject();
            return json;
          } finally {
            response.close();
          }
    }

   private static String readAll(Reader rd) throws IOException {
    StringBuilder sb = new StringBuilder();
    int cp;
    while ((cp = rd.read()) != -1) {
      sb.append((char) cp);
    }
    return sb.toString();
  }

}
