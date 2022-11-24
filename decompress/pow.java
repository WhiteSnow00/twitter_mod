import com.google.android.material.textfield.TextInputLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pow implements cra<TextInputLayout, t5j<noj<sa8>>, oow>
{
    public final kzt<sa8, wow> a;
    public final bxo b;
    public final kcm c;
    
    public pow(final kzt<sa8, wow> a, final bxo b, final kcm c) {
        e0e.f((Object)a, "dateValidator");
        e0e.f((Object)b, "observeScheduler");
        e0e.f((Object)c, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final Object o, final Object o2) {
        final TextInputLayout textInputLayout = (TextInputLayout)o;
        final t5j t5j = (t5j)o2;
        e0e.f((Object)textInputLayout, "editText");
        e0e.f((Object)t5j, "inputObservable");
        return new oow(this.a, (t5j<noj<sa8>>)t5j, (iow)new low(textInputLayout), this.b, this.c);
    }
}
