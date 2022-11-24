// 
// Decompiled by Procyon v0.6.0
// 

public final class wxc implements yxc$a
{
    public static final wxc b;
    
    static {
        b = new wxc();
    }
    
    public final uww a(final fac fac) {
        final int a = xxc.a;
        uww uww;
        if (fac.b.isEmpty() ^ true) {
            final String replace = "https://dev-proxsee.pscp.tv/api/v2/guestReplayPlaylist.m3u8?cookie=XxHuJXsiVXNlcklkIjoiMVJWRFBMam5sTFhBdyIsIlNlc3Npb24iOiIzSl9EdjYwVTRvM0xqekd3QTFsY1VhblVGY05Xazh1VldJRnZNYTE3QVFFIiwiVmVyc2lvbiI6MX0sir4hprS6vFu_nriTTnG-Twkt1jnCwJqXtWaN6uMpoQ%3D%3D&hls_encryption_playlist_prefix=&latest_replay_playlist=false&stream_name=%07c5957f-0d3d-495a-913f-01c22376e353%".replace("%07c5957f-0d3d-495a-913f-01c22376e353%", fac.b);
            final uww$b uww$b = new uww$b();
            uww$b.a = y3.a(fac.b);
            uww$b.c = (c3)new x5k(fac.a);
            uww$b.d = fac.c;
            uww$b.b = "video";
            uww$b.l = true;
            uww$b.g = replace;
            uww = (uww)((z4j)uww$b).e();
        }
        else {
            uww = null;
        }
        return uww;
    }
}
