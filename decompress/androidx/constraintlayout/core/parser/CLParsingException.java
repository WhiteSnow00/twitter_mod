// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.parser;

public class CLParsingException extends Exception
{
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("CLParsingException (");
        j.append(this.hashCode());
        j.append(") : ");
        j.append("null (null at line 0)");
        return j.toString();
    }
}
