package com.sebdev.foobarqix.rule.criteria;

public abstract class AbstractCriteria {

    public abstract boolean isDivisible(String value);

    /**
     * This method  parse an integer reprensented by a string in piece of n digits
     * @param veryBigInteger - integer to parse
     * @param parsingSize - number of digit of each piece
     * @return - int array of veryBigInteger parsing result
     */
    protected int[] parseStringToIntArray(String veryBigInteger, int parsingSize) {
        int firstPieceSize = veryBigInteger.length() % parsingSize;
        int numberOfPieces = calculateSizeOfArray(veryBigInteger.length(), parsingSize, firstPieceSize);
        int[] result = new int[numberOfPieces];
        int beginIndex = 0;
        int endIndex = (firstPieceSize == 0 ? parsingSize : firstPieceSize);
        for (int resultIndex = 0; resultIndex < result.length; resultIndex++) {
            try {
                result[resultIndex] = Integer.parseInt(veryBigInteger.substring(beginIndex, endIndex));
            } catch (NumberFormatException ex) {
                throw new CriteriaVeryBigIntegerFormatException(veryBigInteger, ex);
            }
            beginIndex = endIndex;
            endIndex = endIndex + parsingSize;
        }

        return result;
    }

    private int calculateSizeOfArray(int veryBigIntegerLength, int parseLenght, int firstPieceSize) {
        int numberOfPieces = veryBigIntegerLength / parseLenght;
        if (firstPieceSize != 0) {
            numberOfPieces++;
        }
        return numberOfPieces;
    }
}
