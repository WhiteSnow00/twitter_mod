import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.upstream.i$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ni8 implements dmc
{
    public final i$a<cmc> a() {
        return (i$a<cmc>)new HlsPlaylistParser();
    }
    
    public final i$a<cmc> b(final d d, final c c) {
        return (i$a<cmc>)new HlsPlaylistParser(d, c);
    }
}
