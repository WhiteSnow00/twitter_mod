import java.util.Map;
import android.net.Uri;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atb extends LinkedHashMap<Uri, byte[]>
{
    public final /* synthetic */ int C0;
    
    public atb(final int n) {
        this.C0 = 4;
        super(n, 1.0f, false);
    }
    
    public final boolean removeEldestEntry(final Map.Entry<Uri, byte[]> entry) {
        return this.size() > this.C0;
    }
}
