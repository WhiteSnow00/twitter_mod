import java.util.Objects;
import android.graphics.Rect;
import java.util.List;
import tv.periscope.android.ui.broadcaster.FocusMarkerView;
import tv.periscope.android.ui.broadcaster.CameraPreviewLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bd3
{
    public final CameraPreviewLayout a;
    public final FocusMarkerView b;
    public final nnl<List<Rect>> c;
    public final nnl<tmi> d;
    public final nnl<Float> e;
    public final wc6 f;
    public float g;
    
    public bd3(final CameraPreviewLayout a, final FocusMarkerView b) {
        this.g = 0.0f;
        this.a = a;
        this.b = b;
        this.c = (nnl<List<Rect>>)new nnl();
        this.d = (nnl<tmi>)new nnl();
        this.e = (nnl<Float>)new nnl();
        this.f = new wc6();
    }
    
    public final void a() {
        this.f.e();
        this.f.a(((h5j)this.a.H0).subscribe((lj6)new y0p((Object)this, 23)));
        final wc6 f = this.f;
        final h5j map = ((h5j)this.a.G0).doOnNext((lj6)new hd1((Object)this, 22)).map((psb)new ajd((Object)this, 2));
        final nnl<List<Rect>> c = this.c;
        Objects.requireNonNull(c);
        f.a(map.subscribe((lj6)new id4((nnl)c, 1)));
        final wc6 f2 = this.f;
        final h5j map2 = ((h5j)this.a.I0).map((psb)new kgv((Object)this, 1));
        final nnl<Float> e = this.e;
        Objects.requireNonNull(e);
        f2.a(map2.subscribe((lj6)new kds((Object)e, 22)));
    }
}
