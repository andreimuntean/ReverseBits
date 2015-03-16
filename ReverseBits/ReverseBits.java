import java.util.Scanner;

/**
 * Reverses the bits of 64-bit integers.
 *
 * @author Andrei Muntean
 */
public class ReverseBits
{
    /**
     * Reverses the bits of a 64-bit integer.
     *
     * @param integer A 64-bit integer.
     *
     * @return The integer with its bits reversed.
     */
    public static long reverseBits(long integer)
    {
        long integerWithReversedBits = 0;

        for (short bitIndex = 0; bitIndex < 64; ++bitIndex)
        {
            if ((integer & (1L << (63 - bitIndex))) != 0)
            {
                integerWithReversedBits |= 1L << bitIndex;
            }
        }

        return integerWithReversedBits;
    }

    public static void main(String[] args)
    {
        long integer = Long.parseLong(args[0]);
        long integerWithReversedBits = reverseBits(integer);

        System.out.printf("%d%n(%64s)%n", integer, Long.toBinaryString(integer));
        System.out.printf("%d%n(%64s)%n", integerWithReversedBits, Long.toBinaryString(integerWithReversedBits));
    }
}
