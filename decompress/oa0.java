import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oa0
{
    public final ha0 a;
    public cj4<Bitmap> b;
    public List<cj4<Bitmap>> c;
    public h12 d;
    
    public oa0(final ha0 a) {
        Objects.requireNonNull(a);
        this.a = a;
    }
    
    public oa0(final pa0 pa0) {
        final ha0 a = pa0.a;
        Objects.requireNonNull(a);
        this.a = a;
        this.b = cj4.c((cj4<Bitmap>)pa0.b);
        this.c = (ArrayList)cj4.d((Collection<cj4<Object>>)pa0.c);
        this.d = pa0.e;
    }
}
