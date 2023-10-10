package com;

class Single {

	private static Single sing;

	private Single() {
	}

	public static synchronized Single getSingle() {

		sing = new Single();
		return sing;

	}

}