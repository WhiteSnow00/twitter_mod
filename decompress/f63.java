import java.io.FilterInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f63
{
    public static byte[] a(final Queue<byte[]> queue, final int n) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        final byte[] array = queue.remove();
        if (array.length == n) {
            return array;
        }
        int i = n - array.length;
        final byte[] copy = Arrays.copyOf(array, n);
        while (i > 0) {
            final byte[] array2 = queue.remove();
            final int min = Math.min(i, array2.length);
            System.arraycopy(array2, 0, copy, n - i, min);
            i -= min;
        }
        return copy;
    }
    
    public static byte[] b(final InputStream inputStream) throws IOException {
        final ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            final int min2 = Math.min(min, 2147483639 - i);
            final byte[] array = new byte[min2];
            arrayDeque.add(array);
            int read;
            for (int j = 0; j < min2; j += read, i += read) {
                read = inputStream.read(array, j, min2 - j);
                if (read == -1) {
                    return a(arrayDeque, i);
                }
            }
            final long n = min;
            int n2;
            if (min < 4096) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            final long n3 = n * n2;
            if (n3 > 2147483647L) {
                min = Integer.MAX_VALUE;
                continue;
            }
            if (n3 < -2147483648L) {
                min = Integer.MIN_VALUE;
                continue;
            }
            min = (int)n3;
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
    
    public static final class a extends FilterInputStream
    {
        public long D0;
        public long E0;
        
        public a(final InputStream inputStream) {
            super(inputStream);
            this.E0 = -1L;
            this.D0 = 1048577L;
        }
        
        @Override
        public final int available() throws IOException {
            return (int)Math.min(super.in.available(), this.D0);
        }
        
        @Override
        public final void mark(final int n) {
            synchronized (this) {
                super.in.mark(n);
                this.E0 = this.D0;
            }
        }
        
        @Override
        public final int read() throws IOException {
            if (this.D0 == 0L) {
                return -1;
            }
            final int read = super.in.read();
            if (read != -1) {
                --this.D0;
            }
            return read;
        }
        
        @Override
        public final int read(final byte[] array, int read, int n) throws IOException {
            final long d0 = this.D0;
            if (d0 == 0L) {
                return -1;
            }
            n = (int)Math.min(n, d0);
            read = super.in.read(array, read, n);
            if (read != -1) {
                this.D0 -= read;
            }
            return read;
        }
        
        @Override
        public final void reset() throws IOException {
            synchronized (this) {
                if (!super.in.markSupported()) {
                    throw new IOException("Mark not supported");
                }
                if (this.E0 != -1L) {
                    super.in.reset();
                    this.D0 = this.E0;
                    return;
                }
                throw new IOException("Mark not set");
            }
        }
        
        @Override
        public final long skip(long n) throws IOException {
            n = Math.min(n, this.D0);
            n = super.in.skip(n);
            this.D0 -= n;
            return n;
        }
    }
}
