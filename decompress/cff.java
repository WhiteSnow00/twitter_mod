import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cff
{
    public final Context a;
    public final jef b;
    
    public cff(final Context a, final jef b) {
        zzd.f((Object)a, "context");
        zzd.f((Object)b, "displayTextHelper");
        this.a = a;
        this.b = b;
    }
    
    public final String a(final k93 k93) {
        zzd.f((Object)k93, "cta");
        String s = this.b.a(k93);
        if (!pjr.g((CharSequence)s)) {
            s = this.a.getString(2131954510);
            zzd.e((Object)s, "context.getString(default)");
        }
        return s;
    }
    
    public final String b(String string) {
        if (!pjr.g((CharSequence)string)) {
            string = this.a.getString(2131954676);
            zzd.e((Object)string, "context.getString(default)");
        }
        return string;
    }
}
