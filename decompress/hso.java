import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hso implements gso
{
    public final e67 a;
    public final pwe<vc1> b;
    
    public hso(final e67 a, final pwe<vc1> b) {
        czd.f((Object)a, "credentialStash");
        czd.f((Object)b, "autofillManagerOreo");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final String s, final String s2) {
        czd.f((Object)s, "userId");
        czd.f((Object)s2, "password");
        if (Build$VERSION.SDK_INT >= 26 && ((vc1)this.b.get()).d()) {
            ((vc1)this.b.get()).b();
            return;
        }
        this.a.b(s, s2);
    }
    
    public final void cancel() {
        if (Build$VERSION.SDK_INT >= 26 && ((vc1)this.b.get()).d()) {
            ((vc1)this.b.get()).a();
            return;
        }
        this.a.clear();
    }
}
