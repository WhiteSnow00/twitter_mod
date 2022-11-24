import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.zip.ZipFile;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbz implements aiz
{
    public final Set a;
    public final wyz b;
    public final brz c;
    
    public nbz(final brz c, final Set a, final wyz b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final ZipFile zipFile, final Set<foz> set) throws IOException {
        final Set a = this.a;
        final brz c = this.c;
        final wyz b = this.b;
        final HashSet set2 = new HashSet();
        c.c(b, (Set)set, (glz)new ofz((Set)set2, b, zipFile));
        a.addAll(set2);
    }
}
