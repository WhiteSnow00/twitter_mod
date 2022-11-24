import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.upstream.i$a;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m0b implements dmc
{
    public final dmc a;
    public final List<akr> b;
    
    public m0b(final dmc a, final List<akr> b) {
        this.a = a;
        this.b = b;
    }
    
    public final i$a<cmc> a() {
        return (i$a<cmc>)new n0b((com.google.android.exoplayer2.upstream.i$a<? extends j0b>)this.a.a(), this.b);
    }
    
    public final i$a<cmc> b(final d d, final c c) {
        return (i$a<cmc>)new n0b((com.google.android.exoplayer2.upstream.i$a<? extends j0b>)this.a.b(d, c), this.b);
    }
}
