import java.util.LinkedHashSet;
import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ock<S> extends Fragment
{
    public final LinkedHashSet<rjj<S>> z1;
    
    public ock() {
        this.z1 = new LinkedHashSet<rjj<S>>();
    }
    
    public boolean Y1(final rjj<S> rjj) {
        return this.z1.add(rjj);
    }
}
