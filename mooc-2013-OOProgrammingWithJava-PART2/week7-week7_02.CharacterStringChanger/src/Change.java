/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class Change {

    private char from;
    private char to;

    public Change(char fromCharacter, char toCharacter) {
        this.from = fromCharacter;
        this.to = toCharacter;

    }

    public String change(String characterString) {

        String modifiedString = characterString.replace(this.from, this.to);
        return modifiedString;
    }

}
