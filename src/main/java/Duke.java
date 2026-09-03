public class Duke {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    private String commandType;

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        // The tutorial chatbot has no parser, so the command word alone stands in
        // for the command type that a real chatbot would report.
        String commandWord = input.split(" ", 2)[0];
        commandType = switch (commandWord) {
        case "todo", "deadline", "event" -> "AddCommand";
        case "mark", "unmark" -> "ChangeMarkCommand";
        case "delete" -> "DeleteCommand";
        default -> "UnknownCommand";
        };
        return "Duke heard: " + input;
    }

    /**
     * Returns the type of the command handled by the most recent response.
     */
    public String getCommandType() {
        return commandType;
    }
}
