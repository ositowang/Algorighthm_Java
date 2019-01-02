import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class simplifyPath {
    private simplifyPath() {
    };

    public String simplifyPath(String path) {
        // use stack to store the abcde
        Deque<String> stack = new LinkedList<>();
        // create a set to check the special movement string
        Set<String> checkdict = new HashSet<>(Arrays.asList("..", ".", ""));
        // iterate through the whole path
        for (String dir : path.split("/")) {
            // if we meet '..' we pop out the last dir in the stack
            if (dir.equals("..") && !stack.isEmpty())
                stack.pop();
            // if it is a abcde we push it into the stack
            else if (!checkdict.contains(dir))
                stack.push(dir);
        }
        // build the final result
        String result = "";
        for (String dir : stack)
            res = "/" + dir + res;
        return result.isEmpty() ? "/" : result;
    }
}