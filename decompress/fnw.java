import com.google.android.material.textfield.TextInputLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fnw implements xqa<TextInputLayout, b5j<snj<ea8>>, enw>
{
    public final byt<ea8, mnw> a;
    public final qvo b;
    public final ibm c;
    
    public fnw(final byt<ea8, mnw> a, final qvo b, final ibm c) {
        zzd.f((Object)a, "dateValidator");
        zzd.f((Object)b, "observeScheduler");
        zzd.f((Object)c, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final Object o, final Object o2) {
        final TextInputLayout textInputLayout = (TextInputLayout)o;
        final b5j b5j = (b5j)o2;
        zzd.f((Object)textInputLayout, "editText");
        zzd.f((Object)b5j, "inputObservable");
        return new enw((byt)this.a, b5j, (ymw)new bnw(textInputLayout), this.b, this.c);
    }
}
