package hudson.plugins.jshint.tokens;

import hudson.Extension;
import hudson.plugins.analysis.tokens.AbstractAnnotationsCountTokenMacro;
import hudson.plugins.jshint.CheckStyleMavenResultAction;
import hudson.plugins.jshint.CheckStyleResultAction;

/**
 * Provides a token that evaluates to the number of Checkstyle warnings.
 *
 * @author Ulli Hafner
 */
@Extension(optional = true)
public class CheckStyleWarningCountTokenMacro extends AbstractAnnotationsCountTokenMacro {
    /**
     * Creates a new instance of {@link CheckStyleWarningCountTokenMacro}.
     */
    @SuppressWarnings("unchecked")
    public CheckStyleWarningCountTokenMacro() {
        super("CHECKSTYLE_COUNT", CheckStyleResultAction.class, CheckStyleMavenResultAction.class);
    }
}

