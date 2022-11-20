import java.text.SimpleDateFormat;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mqf implements x9a
{
    public final Resources a;
    
    public mqf(final Resources a) {
        czd.f((Object)a, "resources");
        this.a = a;
    }
    
    public final SimpleDateFormat a() {
        return this.f(2131953019);
    }
    
    public final SimpleDateFormat b() {
        return this.f(2131953020);
    }
    
    public final SimpleDateFormat c() {
        return this.f(2131953018);
    }
    
    public final String d() {
        return this.g(2131953008);
    }
    
    public final String e() {
        return this.g(2131953007);
    }
    
    public final SimpleDateFormat f(final int n) {
        return new SimpleDateFormat(this.g(n), m5s.d());
    }
    
    public final String g(final int n) {
        final String string = this.a.getString(n);
        czd.e((Object)string, "resources.getString(stringId)");
        return string;
    }
}
