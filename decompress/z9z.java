import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.zip.ZipFile;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z9z implements ngz
{
    public final /* synthetic */ Set a;
    public final /* synthetic */ lxz b;
    public final /* synthetic */ opz c;
    
    public z9z(final opz c, final Set a, final lxz b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final ZipFile zipFile, final Set<smz> set) throws IOException {
        final Set a = this.a;
        final opz c = this.c;
        final lxz b = this.b;
        final HashSet set2 = new HashSet();
        c.c(b, (Set)set, (tjz)new bez((Set)set2, b, zipFile));
        a.addAll(set2);
    }
}
