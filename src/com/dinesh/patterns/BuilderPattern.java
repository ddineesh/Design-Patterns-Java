package com.dinesh.patterns;

import com.dinesh.patterns.enums.CoffeeSize;
import com.dinesh.patterns.enums.CoffeeType;

public class BuilderPattern {

	static class Coffee {
		private Coffee(Builder builder) {
			this.type = builder.type;
			this.sugar = builder.sugar;
			this.milk = builder.milk;
			this.size = builder.size;
		}

		private String type;
		private boolean sugar;
		private boolean milk;
		private String size;

		public static class Builder {
			private String type;
			private boolean sugar;
			private boolean milk;
			private String size;

			public Builder(String type) {
				this.type = type;
			}

			public Builder sugar(boolean value) {
				sugar = value;
				return this;
			}

			public Builder milk(boolean value) {
				milk = value;
				return this;
			}

			public Builder size(String value) {
				size = value;
				return this;
			}

			public Coffee build() {
				return new Coffee(this);
			}
		}

		@Override
		public String toString() {
			return String.format("Coffee [type=%s, sugar=%s, milk=%s, size=%s]", type, sugar, milk, size);
		}

	}

	public static void main(String[] args) {
		Coffee coffee = new Coffee.Builder(CoffeeType.MOCHA.coffeeType()).milk(true).sugar(false)
				.size(CoffeeSize.SMALL.coffeeSize()).build();
		System.out.println(coffee);

		Coffee filterCoffee = new Coffee.Builder(CoffeeType.FILTER.coffeeType()).milk(true).sugar(true)
				.size(CoffeeSize.LARGE.coffeeSize()).build();
		System.out.println(filterCoffee);

		// Simplifies Creation
		// More Readable Code
		// Values cannot be modified
	}
}