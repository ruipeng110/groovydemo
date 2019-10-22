package priv.crp.studyproject;

import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyShell;
import groovy.lang.Script;
import org.codehaus.groovy.control.CompilerConfiguration;

/**
 * author: chenruipeng
 * cdt: 2019/10/22
 * mail: chenrp@Ctrip.com
 */
public class DynamicRunScript {

    public static void main(String[] args) throws Exception{
        String input = "1+1";
        GroovyShell shell = new GroovyShell(new CompilerConfiguration(System.getProperties()));
        GroovyClassLoader groovyClassLoader = new GroovyClassLoader();
        Object result = ((Script)groovyClassLoader.parseClass(input).getConstructor(Binding.class).newInstance(shell.getContext())).run();
        System.out.println(result);
    }

}
