abstract public class Measurable implements Comparable<Measurable> {
	abstract float getMeasure();
	@Override
	public int compareTo(Measurable m) {
		return (int) (getMeasure() - m.getMeasure());
	}
}
