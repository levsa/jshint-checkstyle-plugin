package hudson.plugins.jshint.tokens;

import hudson.Extension;
import hudson.plugins.analysis.tokens.AbstractResultTokenMacro;
import hudson.plugins.jshint.CheckStyleMavenResultAction;
import hudson.plugins.jshint.CheckStyleResultAction;

/**
 * Provides a token that evaluates to the Checkstyle build result.
 *
 * @author Ulli Hafner
 */
@Extension(optional = true)
public class CheckStyleResultTokenMacro extends AbstractResultTokenMacro {
    /**
     * Creates a new instance of {@link CheckStyleResultTokenMacro}.
     */
    @SuppressWarnings("unchecked")
    public CheckStyleResultTokenMacro() {
        super("CHECKSTYLE_RESULT", CheckStyleResultAction.class, CheckStyleMavenResultAction.class);
    }
}

