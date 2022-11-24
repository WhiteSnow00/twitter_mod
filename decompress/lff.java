import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lff
{
    public final Context a;
    public final sef b;
    
    public lff(final Context a, final sef b) {
        e0e.f((Object)a, "context");
        e0e.f((Object)b, "displayTextHelper");
        this.a = a;
        this.b = b;
    }
    
    public final String a(final v93 v93) {
        e0e.f((Object)v93, "cta");
        String s = this.b.a(v93);
        if (!flr.g((CharSequence)s)) {
            s = this.a.getString(2131954510);
            e0e.e((Object)s, "context.getString(default)");
        }
        return s;
    }
    
    public final String b(String string) {
        if (!flr.g((CharSequence)string)) {
            string = this.a.getString(2131954676);
            e0e.e((Object)string, "context.getString(default)");
        }
        return string;
    }
}
