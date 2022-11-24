import java.io.File;
import java.io.FilenameFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r4g implements FilenameFilter
{
    public static final r4g a;
    
    static {
        a = new r4g();
    }
    
    @Override
    public final boolean accept(final File file, final String s) {
        return s.startsWith("serialized_local_feature_switches_manifest_");
    }
}
