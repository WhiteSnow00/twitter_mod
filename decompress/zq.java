import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AdapterView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zq extends fmd<Integer>
{
    public final AdapterView<?> D0;
    
    public zq(final AdapterView<?> d0) {
        this.D0 = d0;
    }
    
    public final Object d() {
        return this.D0.getSelectedItemPosition();
    }
    
    public final void e(final ccj<? super Integer> ccj) {
        czd.g((Object)ccj, "observer");
        if (!c9y.j((ccj)ccj)) {
            return;
        }
        final zq.zq$a onItemSelectedListener = new zq.zq$a((AdapterView)this.D0, (ccj)ccj);
        this.D0.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)onItemSelectedListener);
        ccj.onSubscribe((t19)onItemSelectedListener);
    }
}
