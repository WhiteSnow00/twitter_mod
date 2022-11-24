import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.List;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "AddedAbstractMethod" })
public abstract class lsx
{
    public abstract dcu a(final String p0, final uga p1, final List<emj> p2);
    
    public abstract boj b(final String p0);
    
    public abstract boj c(final String p0);
    
    public abstract boj d(final List<? extends gtx> p0);
    
    public abstract boj e(final String p0, final tga p1, final e4k p2);
    
    public final boj f(final String s, final uga uga, final emj emj) {
        return this.g(s, uga, Collections.singletonList(emj));
    }
    
    public abstract boj g(final String p0, final uga p1, final List<emj> p2);
    
    public abstract LiveData<List<hsx>> h(final etx p0);
}
