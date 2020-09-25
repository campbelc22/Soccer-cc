package cs301.Soccer;

import android.util.Log;
import cs301.Soccer.soccerPlayer.SoccerPlayer;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Soccer player database -- presently, all dummied up
 *
 * @Chloe&Ryan
 * @9-29-2020 *** put date of completion here ***
 *
 */
public class SoccerDatabase implements SoccerDB {

    /**
     * add a player
     *
     * @see SoccerDB#addPlayer(String, String, int, String)
     */
    Hashtable<String, SoccerPlayer> hashPlayers = new Hashtable();
    String hash = " ## ";

    @Override
    public boolean addPlayer(String firstName, String lastName,
                             int uniformNumber, String teamName) {
        String playerKey = firstName + " ## " +lastName;
        if(hashPlayers.containsKey(playerKey)){
            return false;
        }
        else {
            SoccerPlayer player1 = new SoccerPlayer(firstName, lastName, uniformNumber, teamName);
            hashPlayers.put(playerKey, player1);
            return true;
        }
    }

    /**
     * remove a player
     *
     * @see SoccerDB#removePlayer(String, String)
     */
    @Override
    public boolean removePlayer(String firstName, String lastName) {
        String hashKey = firstName + " ## " + lastName;
        if(hashPlayers.containsKey(hashKey)){
            hashPlayers.remove(hashKey);
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * look up a player
     *
     * @see SoccerDB#getPlayer(String, String)
     */
    @Override
    public SoccerPlayer getPlayer(String firstName, String lastName) {
        String hashKey = firstName + " ## " + lastName;
        if(hashPlayers.containsKey(hashKey)){
            return hashPlayers.get(hashKey);
        }
        else {
            return null;
        }
    }

    /**
     * increment a player's goals
     *
     * @see SoccerDB#bumpGoals(String, String)
     */
    @Override
    public boolean bumpGoals(String firstName, String lastName) {
        String hashKey = firstName + hash + lastName;
        if(hashPlayers.containsKey(hashKey)){
            hashPlayers.get(hashKey).bumpGoals();
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * increment a player's assists
     *
     * @see SoccerDB#bumpAssists(String, String)
     */
    @Override
    public boolean bumpAssists(String firstName, String lastName) {
        String hashKey = firstName + hash + lastName;
        if(hashPlayers.containsKey(hashKey)){
            hashPlayers.get(hashKey).bumpAssists();
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * increment a player's shots
     *
     * @see SoccerDB#bumpShots(String, String)
     */
    @Override
    public boolean bumpShots(String firstName, String lastName) {
        String hashKey = firstName + hash + lastName;
        if(hashPlayers.containsKey(hashKey)){
            hashPlayers.get(hashKey).bumpShots();
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * increment a player's saves
     *
     * @see SoccerDB#bumpSaves(String, String)
     */
    @Override
    public boolean bumpSaves(String firstName, String lastName) {
        String hashKey = firstName + hash + lastName;
        if(hashPlayers.containsKey(hashKey)){
            hashPlayers.get(hashKey).bumpSaves();
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * increment a player's fouls
     *
     * @see SoccerDB#bumpFouls(String, String)
     */
    @Override
    public boolean bumpFouls(String firstName, String lastName) {
        String hashKey = firstName + hash + lastName;
        if(hashPlayers.containsKey(hashKey)){
            hashPlayers.get(hashKey).bumpFouls();
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * increment a player's yellow cards
     *
     * @see SoccerDB#bumpYellowCards(String, String)
     */
    @Override
    public boolean bumpYellowCards(String firstName, String lastName) {
        String hashKey = firstName + hash + lastName;
        if(hashPlayers.containsKey(hashKey)){
            hashPlayers.get(hashKey).bumpYellowCards();
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * increment a player's red cards
     *
     * @see SoccerDB#bumpRedCards(String, String)
     */
    @Override
    public boolean bumpRedCards(String firstName, String lastName) {
        String hashKey = firstName + hash + lastName;
        if(hashPlayers.containsKey(hashKey)){
            hashPlayers.get(hashKey).bumpRedCards();
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * tells the number of players on a given team
     *
     * @see SoccerDB#numPlayers(String)
     */
    @Override
    // report number of players on a given team (or all players, if null)
    public int numPlayers(String teamName) {
        
        return -1;
    }

    /**
     * gives the nth player on a the given team
     *
     * @see SoccerDB#playerNum(int, String)
     */
    // get the nTH player
    @Override
    public SoccerPlayer playerNum(int idx, String teamName) {
        return null;
    }

    /**
     * reads database data from a file
     *
     * @see SoccerDB#readData(java.io.File)
     */
    // read data from file
    @Override
    public boolean readData(File file) {
        return file.exists();
    }

    /**
     * write database data to a file
     *
     * @see SoccerDB#writeData(java.io.File)
     */
    // write data to file
    @Override
    public boolean writeData(File file) {
        return false;
    }

    /**
     * helper method that logcat-logs a string, and then returns the string.
     * @param s the string to log
     * @return the string s, unchanged
     */
    private String logString(String s) {
        Log.i("write string", s);
        return s;
    }

    /**
     * returns the list of team names in the database
     *
     * @see cs301.Soccer.SoccerDB#getTeams()
     */
    // return list of teams
    @Override
    public HashSet<String> getTeams() {
        return new HashSet<String>();
    }

}
