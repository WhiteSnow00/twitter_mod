import android.os.Bundle;
import android.net.Uri;
import java.util.Objects;
import android.view.ContentInfo;
import android.content.ClipData;
import android.content.ClipData$Item;
import java.util.List;
import android.content.ClipDescription;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pm6
{
    public final e a;
    
    public pm6(final e a) {
        this.a = a;
    }
    
    public static ClipData a(final ClipDescription clipDescription, final List<ClipData$Item> list) {
        final ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData$Item)list.get(0));
        for (int i = 1; i < list.size(); ++i) {
            clipData.addItem((ClipData$Item)list.get(i));
        }
        return clipData;
    }
    
    public final ClipData b() {
        return this.a.i();
    }
    
    public final ContentInfo c() {
        final ContentInfo k = this.a.k();
        Objects.requireNonNull(k);
        final ContentInfo contentInfo = k;
        return k;
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
    
    public interface b
    {
        pm6 b();
        
        void g(final int p0);
        
        void h(final Uri p0);
        
        void i(final ClipData p0);
        
        void setExtras(final Bundle p0);
    }
    
    public interface e
    {
        Bundle getExtras();
        
        int h();
        
        ClipData i();
        
        Uri j();
        
        ContentInfo k();
        
        int m();
    }
}
