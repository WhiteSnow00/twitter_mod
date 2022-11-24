import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e8d extends np1
{
    public String a;
    public final d8d b;
    
    public e8d(final String a, final d8d b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void h(String a, final String s, final boolean b) {
        final d8d b2 = this.b;
        if (b2 != null) {
            a = this.a;
            Objects.requireNonNull(s);
            int n = -1;
            final int hashCode = s.hashCode();
            int n2 = 7;
            switch (hashCode) {
                case 2113652014: {
                    if (!s.equals("LocalContentUriFetchProducer")) {
                        break;
                    }
                    n = 14;
                    break;
                }
                case 2109593398: {
                    if (!s.equals("PartialDiskCacheProducer")) {
                        break;
                    }
                    n = 13;
                    break;
                }
                case 1793127518: {
                    if (!s.equals("LocalContentUriThumbnailFetchProducer")) {
                        break;
                    }
                    n = 12;
                    break;
                }
                case 1721672898: {
                    if (!s.equals("DataFetchProducer")) {
                        break;
                    }
                    n = 11;
                    break;
                }
                case 1023071510: {
                    if (!s.equals("PostprocessedBitmapMemoryCacheProducer")) {
                        break;
                    }
                    n = 10;
                    break;
                }
                case 1019542023: {
                    if (!s.equals("LocalAssetFetchProducer")) {
                        break;
                    }
                    n = 9;
                    break;
                }
                case 957714404: {
                    if (!s.equals("BitmapMemoryCacheProducer")) {
                        break;
                    }
                    n = 8;
                    break;
                }
                case 656304759: {
                    if (!s.equals("DiskCacheProducer")) {
                        break;
                    }
                    n = 7;
                    break;
                }
                case 473552259: {
                    if (!s.equals("VideoThumbnailProducer")) {
                        break;
                    }
                    n = 6;
                    break;
                }
                case -1224383234: {
                    if (!s.equals("NetworkFetchProducer")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case -1307634203: {
                    if (!s.equals("EncodedMemoryCacheProducer")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case -1579985851: {
                    if (!s.equals("LocalFileFetchProducer")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case -1683996557: {
                    if (!s.equals("LocalResourceFetchProducer")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1914072202: {
                    if (!s.equals("BitmapMemoryCacheGetProducer")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1917159454: {
                    if (!s.equals("QualifiedResourceFetchProducer")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            while (true) {
                switch (n) {
                    default: {
                        n2 = 1;
                    }
                    case 0:
                    case 2:
                    case 3:
                    case 6:
                    case 9:
                    case 11:
                    case 12:
                    case 14: {
                        b2.a(a, n2, b, s);
                        break;
                    }
                    case 7:
                    case 13: {
                        n2 = 3;
                        continue;
                    }
                    case 5: {
                        n2 = 2;
                        continue;
                    }
                    case 4: {
                        n2 = 4;
                        continue;
                    }
                    case 1:
                    case 8:
                    case 10: {
                        n2 = 5;
                        continue;
                    }
                }
                break;
            }
        }
    }
}
