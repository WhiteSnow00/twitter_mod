import java.io.File;
import java.io.FileFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkz implements FileFilter
{
    public static final jkz a;
    
    static {
        a = new jkz();
    }
    
    @Override
    public final boolean accept(final File file) {
        final int p = ara.p;
        return file.getName().endsWith(".apk");
    }
}
