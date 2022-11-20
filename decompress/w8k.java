import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w8k<K, V> extends c8k<K, V, Map.Entry<? extends K, ? extends V>>
{
    public w8k(final e3u<K, V> e3u) {
        czd.f((Object)e3u, "node");
        final h3u[] array = new h3u[8];
        for (int i = 0; i < 8; ++i) {
            array[i] = (h3u)new j3u();
        }
        super((e3u)e3u, array);
    }
}
