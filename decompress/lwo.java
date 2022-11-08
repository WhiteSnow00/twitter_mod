import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwo implements qll
{
    public final qll<Context> C0;
    public final qll<String> D0;
    public final qll<Integer> E0;
    
    public lwo(final qll<Context> c0, final qll<String> qll, final qll<Integer> qll2) {
        final rda a = rda$a.a;
        final sda a2 = sda$a.a;
        this.C0 = c0;
        this.D0 = (qll<String>)a;
        this.E0 = (qll<Integer>)a2;
    }
    
    public final Object get() {
        return new kwo((Context)this.C0.get(), (String)this.D0.get(), (int)this.E0.get());
    }
}
